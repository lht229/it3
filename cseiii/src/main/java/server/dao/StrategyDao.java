package server.dao;

import java.util.ArrayList;

import server.others.UpdateResult;

import vopo.StrategyPo;


public interface StrategyDao {
	/**
	 * @param sharesId 股票代码的列表,开始日期，结束日期
	 * @return 对应时期的股票信息
	 */
	public StrategyPo getSharesDate(ArrayList<String> sharesId,String beginDate,String endDate);

	public StrategyPo getStrategyPo(String strategyID);
	
	public ArrayList <StrategyPo> getMakeStrategyList (String userID);
	
	public ArrayList <StrategyPo> getStoreStrategyList (String userID);
	
	public UpdateResult updateStrategy (StrategyPo po);
	
	public ArrayList <StrategyPo> getAllStrategy ();
	
	public Boolean deleteStrategy (String strategyID);
	
	public Boolean addStoreStrategy (String userID, String strategyID);
	
	public StrategyPo cancelStoreStrategy (String userID, String strategyID);
	
	public Boolean addStrategy  (StrategyPo po);
}
