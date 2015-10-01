package net.anumbrella.notes.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author anumbrella
 * 
 * @date 2015-10-1 下午3:44:38
 * 
 *       listView适配器
 */
public class NotesListAdapter extends CursorAdapter {

	public NotesListAdapter(Context context, Cursor c) {
		super(context, c);
	}

	@Override
	public void bindView(View arg0, Context arg1, Cursor arg2) {

	}

	@Override
	public View newView(Context arg0, Cursor arg1, ViewGroup arg2) {
		return null;
	}

}
