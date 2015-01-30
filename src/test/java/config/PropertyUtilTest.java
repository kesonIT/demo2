/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package config;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/***************************************************************************
 *  
 *  Project Name     :  demo2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 27, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class PropertyUtilTest {

	PropertyUtil propUtil = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		propUtil = new PropertyUtil("bundle", "/src/main/resources/bundle/");
	}

	/**
	 * Test method for {@link config.PropertyUtil#PropertyUtil(java.lang.String)}.
	 */
	@Test
	public void testPropertyUtilString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link config.PropertyUtil#PropertyUtil(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testPropertyUtilStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link config.PropertyUtil#clearPropertyCache()}.
	 */
	@Test
	public void testClearPropertyCache() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link config.PropertyUtil#get(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGet() {
		System.out.println(propUtil.get("keson", "default"));
	}

	/**
	 * Test method for {@link config.PropertyUtil#getPropertyBundleName()}.
	 */
	@Test
	public void testGetPropertyBundleName() {
		System.out.println(propUtil.getPropertyBundleName());
	}

	/**
	 * Test method for {@link config.PropertyUtil#getSystemOrPropertyString(java.lang.String, java.lang.String, boolean)}.
	 */
	@Test
	public void testGetSystemOrPropertyString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link config.PropertyUtil#setPropertyBundleName(java.lang.String)}.
	 */
	@Test
	public void testSetPropertyBundleName() {
		fail("Not yet implemented");
	}

}
