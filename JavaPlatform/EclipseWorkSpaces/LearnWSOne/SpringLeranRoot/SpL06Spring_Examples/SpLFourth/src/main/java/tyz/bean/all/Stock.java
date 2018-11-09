package tyz.bean.all;
import java.io.Serializable;

public class Stock implements Serializable  {
	
	private Long stockId;
	private String stockCode;
	private String stockName;
	/**
	 * @return stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}
	/**
	 * @param stockCode 要设置的 stockCode
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/**
	 * @return stockName
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName 要设置的 stockName
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return stockId
	 */
	public Long getStockId() {
		return stockId;
	}
	/**
	 * @param stockId 要设置的 stockId
	 */
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

}
