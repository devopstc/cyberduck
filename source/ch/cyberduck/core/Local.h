/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class ch_cyberduck_core_Local */

#ifndef _Included_ch_cyberduck_core_Local
#define _Included_ch_cyberduck_core_Local
#ifdef __cplusplus
extern "C" {
#endif
/* Inaccessible static: fs */
/* Inaccessible static: separatorChar */
/* Inaccessible static: pathSeparatorChar */
/* Inaccessible static: tmpFileLock */
/* Inaccessible static: counter */
/* Inaccessible static: tmpdir */
#undef ch_cyberduck_core_Local_serialVersionUID
#define ch_cyberduck_core_Local_serialVersionUID 301077366599181567LL
/* Inaccessible static: log */
/* Inaccessible static: longDateFormatter */
/* Inaccessible static: shortDateFormatter */
/* Inaccessible static: class_00024ch_00024cyberduck_00024core_00024Local */
/*
 * Class:     ch_cyberduck_core_Local
 * Method:    setIconFromExtension
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_setIconFromExtension
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    setIconFromFile
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_setIconFromFile
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    removeCustomIcon
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_removeCustomIcon
  (JNIEnv *, jobject, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    kind
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT jstring JNICALL Java_ch_cyberduck_core_Local_kind
  (JNIEnv *, jobject, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    applicationForExtension
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT jstring JNICALL Java_ch_cyberduck_core_Local_applicationForExtension
  (JNIEnv *, jobject, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    quicklook
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_quicklook
  (JNIEnv *, jobject, jobjectArray);

#ifdef __cplusplus
}
#endif
#endif
