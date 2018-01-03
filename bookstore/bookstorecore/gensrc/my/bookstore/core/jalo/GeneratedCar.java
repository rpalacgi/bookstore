/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-Jan-2018 5:31:57 PM                       ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Car}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCar extends Product
{
	/** Qualifier of the <code>Car.mechanic</code> attribute **/
	public static final String MECHANIC = "mechanic";
	/** Qualifier of the <code>Car.hp</code> attribute **/
	public static final String HP = "hp";
	/** Qualifier of the <code>Car.fuel</code> attribute **/
	public static final String FUEL = "fuel";
	/** Qualifier of the <code>Car.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	/**
	* {@link OneToManyHandler} for handling 1:n DRIVERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Employee> DRIVERSHANDLER = new OneToManyHandler<Employee>(
	CoreConstants.TC.EMPLOYEE,
	false,
	"car",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MECHANIC, AttributeMode.INITIAL);
		tmp.put(HP, AttributeMode.INITIAL);
		tmp.put(FUEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Employee> getDrivers(final SessionContext ctx)
	{
		return DRIVERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Employee> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final SessionContext ctx, final Collection<Employee> value)
	{
		DRIVERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final Collection<Employee> value)
	{
		setDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final SessionContext ctx, final Employee value)
	{
		DRIVERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final Employee value)
	{
		addToDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final SessionContext ctx, final Employee value)
	{
		DRIVERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final Employee value)
	{
		removeFromDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.fuel</code> attribute.
	 * @return the fuel - Fuel for this car
	 */
	public String getFuel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.fuel</code> attribute.
	 * @return the fuel - Fuel for this car
	 */
	public String getFuel()
	{
		return getFuel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.fuel</code> attribute. 
	 * @param value the fuel - Fuel for this car
	 */
	public void setFuel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.fuel</code> attribute. 
	 * @param value the fuel - Fuel for this car
	 */
	public void setFuel(final String value)
	{
		setFuel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute.
	 * @return the hp - Horse Power
	 */
	public Integer getHp(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute.
	 * @return the hp - Horse Power
	 */
	public Integer getHp()
	{
		return getHp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute. 
	 * @return the hp - Horse Power
	 */
	public int getHpAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHp( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute. 
	 * @return the hp - Horse Power
	 */
	public int getHpAsPrimitive()
	{
		return getHpAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp - Horse Power
	 */
	public void setHp(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp - Horse Power
	 */
	public void setHp(final Integer value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp - Horse Power
	 */
	public void setHp(final SessionContext ctx, final int value)
	{
		setHp( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp - Horse Power
	 */
	public void setHp(final int value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.mechanic</code> attribute.
	 * @return the mechanic
	 */
	public Employee getMechanic(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, MECHANIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.mechanic</code> attribute.
	 * @return the mechanic
	 */
	public Employee getMechanic()
	{
		return getMechanic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.mechanic</code> attribute. 
	 * @param value the mechanic
	 */
	public void setMechanic(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, MECHANIC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.mechanic</code> attribute. 
	 * @param value the mechanic
	 */
	public void setMechanic(final Employee value)
	{
		setMechanic( getSession().getSessionContext(), value );
	}
	
}
