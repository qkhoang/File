package magicUWE.stereotypes.tags;

import magicUWE.settings.GlobalConstants;
import magicUWE.stereotypes.UWEStereotypeClassPres;

/**
 * PresentationPage Tags
 * 
 * @author PST LMU
 * 
 */
public enum UWETagPresentationPage implements NodeTag {
	LIVE_FEEDBACK("liveFeedback", true);

	
	public final static String associatedStereotype = UWEStereotypeClassPres.PRESENTATION_PAGE.toString();

	private final String name;
	private final boolean isBoolean;
	private String riaOption = GlobalConstants.RIA_OPTION_ASK_EVERYTIME;

	private UWETagPresentationPage(String name, boolean isBoolean) {
		this.name = name;
		this.isBoolean = isBoolean;
	}

	@Override
	public String getAssociatedStereotypeName() {
		return associatedStereotype;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean isBoolean() {
		return isBoolean;
	}
	
	@Override
	public String getRIAOption() {
		return riaOption;
	}

	@Override
	public void setRIAOption(String option) {
		this.riaOption = option;
	}
}
