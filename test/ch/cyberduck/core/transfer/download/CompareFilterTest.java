package ch.cyberduck.core.transfer.download;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.Local;
import ch.cyberduck.core.NullLocal;
import ch.cyberduck.core.NullSession;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.synchronization.ComparisionServiceFilter;
import ch.cyberduck.core.synchronization.Comparison;
import ch.cyberduck.core.transfer.TransferStatus;
import ch.cyberduck.core.transfer.symlink.SymlinkResolver;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.assertFalse;

/**
 * @version $Id$
 */
public class CompareFilterTest extends AbstractTestCase {

    @Test
    public void testAcceptEqual() throws Exception {
        final CompareFilter filter = new CompareFilter(new SymlinkResolver<Path>() {
            @Override
            public boolean resolve(final Path file) {
                return false;
            }

            @Override
            public String relativize(final String base, final String name) {
                return null;
            }
        }, new NullSession(new Host("t")), new DownloadFilterOptions(), new ComparisionServiceFilter(new NullSession(new Host("t")), null) {
            @Override
            public Comparison compare(final Path file, final Local local) throws BackgroundException {
                return Comparison.equal;
            }
        }
        );
        final Path file = new Path("/f", EnumSet.of(Path.Type.file));
        final Local local = new NullLocal("/", "f");
        assertFalse(filter.accept(file, local, new TransferStatus().exists(true)));
    }
}
