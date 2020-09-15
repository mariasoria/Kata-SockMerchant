import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SockMerchantTest {

    @Test
    public void shouldReturn0pair(){
        assertEquals(0, SockMerchant.sockMerchant(1, new int []{1}));
    }

    @Test
    public void shouldReturn1pair(){
        assertEquals(1, SockMerchant.sockMerchant(2, new int []{1, 1}));
    }

    @Test
    public void shouldReturn3pairs_01(){
        assertEquals(2, SockMerchant.sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2}));
    }

    @Test
    public void shouldReturn3pairs_02(){
        assertEquals(3, SockMerchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    @Test
    public void shouldReturn4pairs(){
        assertEquals(4, SockMerchant.sockMerchant(11, new int[]{10, 11, 30, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

}
