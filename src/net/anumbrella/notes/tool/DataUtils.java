package net.anumbrella.notes.tool;

import java.util.HashSet;

import android.content.ContentResolver;

/**
 * @author anumbrella
 * 
 * @date 2015-10-4 上午11:21:01
 * 
 *       数据处理工具
 */
public class DataUtils {

	public static final String TAG = "DataUtils";

	/**
	 * 批处理删除便签Notes
	 * 
	 * @param resolver
	 * @param ids
	 * @return
	 */
	public static boolean batchDeleteNotes(ContentResolver resolver,
			HashSet<Long> ids) {

		return false;
	}

	/**
	 * 移动单个便签到文件中去
	 * 
	 * @param resolver
	 * @param id
	 * @param srcFolderId
	 * @param desFolderId
	 * @return
	 */
	public static boolean moveNoteToFolder(ContentResolver resolver, long id,
			long srcFolderId, long desFolderId) {

		return false;

	}

	/**
	 * 批处理移动便签到文件夹当中
	 * 
	 * @param resolver
	 * @param ids
	 * @param folderId
	 * @return
	 */
	public static boolean batchMoveToFolder(ContentResolver resolver,
			HashSet<Long> ids, long folderId) {

		return false;
	}

	/**
	 * 获得用户所用的文件夹,除开系统文件外
	 * 
	 * @param resolver
	 * @return
	 */
	public static int getUserFolderCount(ContentResolver resolver) {

		return 0;

	}

	/**
	 * 
	 * @param resolver
	 * @param noteId
	 * @param type
	 * @return
	 */
	public static boolean visibleInNoteDatabase(ContentResolver resolver,
			long noteId, int type) {

		return false;

	}

	/**
	 * @param resolver
	 * @param noteId
	 * @return
	 */
	public static boolean existNoteInDatabase(ContentResolver resolver,
			long noteId) {
		return false;
	}

	/**
	 * @param resolver
	 * @param dataId
	 * @return
	 */
	public static boolean existDataInDatabase(ContentResolver resolver,
			long dataId) {
		return false;
	}

	/**
	 * @param resolver
	 * @param name
	 * @return
	 */
	public static boolean checkVisibleFolderName(ContentResolver resolver,
			String name) {

		return false;
	}

	/**
	 * @param resolver
	 * @param noteId
	 * @return
	 */
	public static String getCallNumberByNoteId(ContentResolver resolver,
			long noteId) {
		return null;
	}

	/**
	 * @return
	 */
	public static long getNoteIdByPhoneNumberAndCallData() {

		return 0;

	}

	/**
	 * @param resolver
	 * @param noteId
	 * @return
	 */
	public static String getSnippetById(ContentResolver resolver, long noteId) {

		return null;

	}

	/**
	 * @param snippet
	 * @return
	 */
	public static String getFormattedSnippet(String snippet) {
		return null;
	}

}
