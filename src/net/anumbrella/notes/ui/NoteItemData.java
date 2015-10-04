package net.anumbrella.notes.ui;

/**
 * @author anumbrella
 * 
 * @date 2015-10-4 上午9:26:16
 * 
 *       每条便签的数据设置
 */
public class NoteItemData {

	private long mId;

	private long mParentId;

	private String mName;

	/**
	 * 便签总数
	 */
	private int mNotesCount;

	/**
	 * 数据类型
	 */
	private int mType;

	public int getType() {
		return mType;
	}

	public long getId() {
		return mId;
	}

	public int getNotesCount() {
		return mNotesCount;
	}

	public long getParentId() {
		return mParentId;
	}

	public String getCallName() {
		return mName;
	}

}
