package jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.skillstorm.jdbc.ArtistDAO;
import com.skillstorm.jdbc.beans.Artist;

public class ArtistDAOTest {
	
	static ArtistDAO dao;
	
	@BeforeClass
	public static void setup() {
		try {
			dao = new ArtistDAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findById() {
		try {
			Artist expected = new Artist(50, "Metallica");
			assertEquals(expected, dao.findById(50));
		} catch (SQLException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void findAll() {
		try {
			Set<Artist> artists = dao.findAll();
			// assertEquals(100, artists.size()); //
			assertTrue(artists.size() > 0);
		} catch (SQLException e) {
			e.printStackTrace();
			fail();
		}
	}
	

	@Test
	public void create() {
		try {
			boolean success = dao.create(new Artist("The JUnit Marching Band"));
			assertEquals(true, success);
		}catch(SQLException e) {
			e.printStackTrace();
			fail();
		}
	}
	
}
