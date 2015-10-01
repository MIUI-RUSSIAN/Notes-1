package net.anumbrella.notes.ui;

import net.anumbrella.notes.data.Notes;
import android.app.Activity;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

import com.example.miui_notes.R;

/**
 * @author anumbrella
 * 
 * @date 2015-9-13 上午9:41:55
 * 
 *       主引导activity
 */
public class MainActivity extends Activity implements OnItemLongClickListener {

	/**
	 * 获取数据模型的resolver
	 */
	private ContentResolver mContentResolver;

	/**
	 * 异步查询(query)
	 */
	private BackgroundQueryHandler mBackgroundQueryHandler;

	/**
	 * 当前文件的标识
	 */
	private long mCurrentFolderId;

	/**
	 * 便签显示ListView
	 */
	private ListView mNotesListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		// 初始化一些资源文件
		initResources();

	}

	/**
	 * 初始化一些资源文件
	 */
	private void initResources() {
		mContentResolver = getContentResolver();
		mBackgroundQueryHandler = new BackgroundQueryHandler(
				this.getContentResolver());
		mCurrentFolderId = Notes.ID_ROOT_FOLDER; // 默认值为0
		mNotesListView = (ListView) findViewById(R.id.notes_list);

		// 添加footerView到listView当中
		mNotesListView.addFooterView(
				LayoutInflater.from(this).inflate(R.layout.note_list_footer,
						null), null, false);
		// 给ListView每个选项添加点击事件
		mNotesListView.setOnItemClickListener(new OnItemListClickListener());
		// 给ListView每个选项添加长按点击事件
		mNotesListView.setOnItemLongClickListener(this);
		
		

	}

	/**
	 * 异步处理查询(异步查询方法)
	 */
	private class BackgroundQueryHandler extends AsyncQueryHandler {

		public BackgroundQueryHandler(ContentResolver cr) {
			super(cr);
		}

		/**
		 * 完成异步query操作后的回调方法
		 */
		@Override
		protected void onQueryComplete(int token, Object cookie, Cursor cursor) {

		}
	}

	/**
	 * 给ListView的每个item添加点击监听事件
	 */
	private class OnItemListClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {

		}

	}

	/**
	 * ListView的每个item添加长按点击监听事件
	 * 
	 * @param parent
	 * @param view
	 * @param position
	 * @param id
	 * @return
	 */
	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view,
			int position, long id) {
		return false;
	}

}
