package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;


import com.example.stockspring.model.Stock;

public interface StockDao {

	  public boolean insertStock(Stock stock) throws SQLException;
	    
		public List<Stock> getStockList() throws SQLException;

}
