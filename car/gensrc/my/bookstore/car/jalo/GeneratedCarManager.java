/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23-Dec-2017 1:47:02 PM                      ---
 * ----------------------------------------------------------------
 */
package my.bookstore.car.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.car.constants.CarConstants;
import my.bookstore.car.jalo.Car;

/**
 * Generated class for type <code>CarManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCarManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("car", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Employee", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.car</code> attribute.
	 * @return the car
	 */
	public Car getCar(final SessionContext ctx, final Employee item)
	{
		return (Car)item.getProperty( ctx, CarConstants.Attributes.Employee.CAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.car</code> attribute.
	 * @return the car
	 */
	public Car getCar(final Employee item)
	{
		return getCar( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.car</code> attribute. 
	 * @param value the car
	 */
	public void setCar(final SessionContext ctx, final Employee item, final Car value)
	{
		item.setProperty(ctx, CarConstants.Attributes.Employee.CAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.car</code> attribute. 
	 * @param value the car
	 */
	public void setCar(final Employee item, final Car value)
	{
		setCar( getSession().getSessionContext(), item, value );
	}
	
	public Car createCar(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CarConstants.TC.CAR );
			return (Car)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Car : "+e.getMessage(), 0 );
		}
	}
	
	public Car createCar(final Map attributeValues)
	{
		return createCar( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CarConstants.EXTENSIONNAME;
	}
	
}
