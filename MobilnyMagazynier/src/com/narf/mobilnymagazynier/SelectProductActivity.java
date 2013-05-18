package com.narf.mobilnymagazynier;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class SelectProductActivity extends TabActivity
{

	private String products[] =
	{ "Produkt1", "Produkt2", "Produkt3", "Produkt4" };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_product);

		TabHost tabHost = getTabHost();
		tabHost.addTab(tabHost.newTabSpec("tab_ChooseProd")
				.setIndicator("Wybór produktu")
				.setContent(R.id.chooseProductTab));
		tabHost.addTab(tabHost.newTabSpec("tab_ProdDetails")
				.setIndicator("Szczegó³y").setContent(R.id.productDetailsTab));

		tabHost.setCurrentTab(0);

		ListView productsListView = (ListView) findViewById(R.id.listProducts);
		ArrayList<String> productsList = new ArrayList<String>();
		productsList.addAll(Arrays.asList(products));

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.product_list_row, productsList);
		productsListView.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_product, menu);
		return true;
	}

}
