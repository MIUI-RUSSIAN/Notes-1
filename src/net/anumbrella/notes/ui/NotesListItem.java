package net.anumbrella.notes.ui;

import net.anumbrella.notes.data.Notes;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.miui_notes.R;

/**
 * @author anumbrella
 * 
 * @date 2015-10-1 下午3:47:11
 * 
 *       listView每一个item便签选项的布局文件
 */
public class NotesListItem extends LinearLayout {

	private ImageView mAlert;
	private TextView mTitle;
	private TextView mTime;
	private TextView mCallName;
	private CheckBox mCheckBox;

	/**
	 * 便签数据
	 */
	private NoteItemData mItemData;

	public NotesListItem(Context context) {
		super(context);
		inflate(context, R.layout.note_item, this);
		mAlert = (ImageView) findViewById(R.id.iv_alert_icon);
		mTitle = (TextView) findViewById(R.id.tv_title);
		mCallName = (TextView) findViewById(R.id.tv_name);
		mCheckBox = (CheckBox) findViewById(android.R.id.checkbox);
	}

	/**
	 * 数据与视图绑定
	 * 
	 * @param context
	 * @param data
	 * @param choiceMode
	 * @param Checked
	 */
	public void bind(Context context, NoteItemData data, boolean choiceMode,
			boolean checked) {

		// 如果是便签类型并且是多选
		if (choiceMode && data.getType() == Notes.TYPE_NOTE) {
			mCheckBox.setVisibility(View.VISIBLE);
			mCheckBox.setChecked(checked);
		} else {
			mCheckBox.setVisibility(View.GONE);
		}

		// 把需要绑定的数据传进来
		mItemData = data;

		// 如果便签数据是通话便签文件夹标识,设置相关属性
		if (data.getId() == Notes.ID_CALL_RECORD_FOLDER) {
			mCallName.setVisibility(View.GONE);
			mAlert.setVisibility(View.VISIBLE);
			mTitle.setTextAppearance(context, R.style.TextAppearancePrimaryItem);
			mTitle.setText(context.getString(R.string.call_record_folder_name)
					+ context.getString(R.string.format_folder_files_count));
			mAlert.setImageResource(R.drawable.call_record);
			// 如果父id是通话便签文件夹标识
		} else if (data.getParentId() == Notes.ID_CALL_RECORD_FOLDER) {
			mCallName.setVisibility(View.VISIBLE);
			mCallName.setText(data.getCallName());
			mTitle.setTextAppearance(context, R.style.TextAppearanceSecondaryItem);
			

		}

	}

	/**
	 * 便签视图背景设置
	 * 
	 * @param data
	 */
	private void setBackground(NoteItemData data) {

	}

	public NoteItemData getItemData() {
		return mItemData;
	}
}
