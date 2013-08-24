package edu.ub.tfc.recommender.services.impl;

import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import edu.ub.tfc.recommender.services.RecommenderInterface;

/**
 * Controlador que conecta el servlet con el recomendador user-based.
 * @author David Gil De Arce
 */
public class UserRecommenderService extends RecommenderAbstract implements RecommenderInterface {
	
	private Long userID;
	private Integer howMany;

	public UserRecommenderService() { }

	/**
	 * @see edu.ub.tfc.recommender.services.impl.RecommenderAbstract#recommend()
	 */
	@Override
	public List<RecommendedItem> recommend() throws TasteException {
		return recommender.recommend(userID, howMany);
	}

	/**
	 * @param userID ID del usuario
	 */
	public void setUserID(Long userID) {
		this.userID = userID;
	}

	/**
	 * @param howMany N�mero de �tems
	 */
	public void setHowMany(Integer howMany) {
		this.howMany = howMany;
	}

}
