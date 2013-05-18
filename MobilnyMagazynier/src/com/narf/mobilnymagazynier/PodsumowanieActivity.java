package com.narf.mobilnymagazynier;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.Menu;

public class PodsumowanieActivity extends Activity
{
	private void dialogIstnieje()
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(
				R.string.activity_podsumowanie_dialog_istnieje_message)
				.setTitle(R.string.activity_podsumowanie_dialog_istnieje_title);
		builder.setPositiveButton(R.string.tak,
				new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int id)
					{
						// User clicked OK button
					}
				});
		builder.setNegativeButton(R.string.nie,
				new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int id)
					{
						// User cancelled the dialog
					}
				});
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	private void dialogSukces()
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(
				R.string.activity_podsumowanie_dialog_sukces_message)
				.setTitle(R.string.activity_podsumowanie_dialog_sukces_title);
		builder.setPositiveButton(R.string.ok,
				new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int id)
					{
						// User clicked OK button
					}
				});
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	private void dialogBlad()
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(
				R.string.activity_podsumowanie_dialog_blad_message)
				.setTitle(R.string.activity_podsumowanie_dialog_blad_title);
		builder.setPositiveButton(R.string.ponow,
				new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int id)
					{
						// User clicked OK button
					}
				});
		builder.setNegativeButton(R.string.anuluj,
				new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int id)
					{
						// User cancelled the dialog
					}
				});
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	private void dialogWysylanie()
	{
		ProgressDialog.Builder builder = new ProgressDialog.Builder(this);
		builder.setMessage(R.string.activity_podsumowanie_dialog_wysylanie_message);
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_podsumowanie);
		//dialogWysylanie();
		dialogIstnieje();
		//dialogSukces();
		//dialogBlad();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.podsumowanie, menu);
		return true;
	}

}
