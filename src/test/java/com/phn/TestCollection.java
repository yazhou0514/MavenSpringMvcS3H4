/**
 * 
 */
package com.phn;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * @author Wang Yazhou
 */
public class TestCollection {

	@Test
	public void listNull() throws Exception {
		
		
		
		
	}

	public static void ddd(List<String> list) throws Exception {
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {

			System.out.println(iterator.next());
		}
	}
}
