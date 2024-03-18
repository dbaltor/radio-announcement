package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RadioAnnouncementTest {

        private RadioAnnouncement radioAnnouncement;

        @BeforeEach
        void setup() {
                radioAnnouncement = new RadioAnnouncement();
        }

	@Test
	void shouldReturnTheRightAnouncementFor10am20() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(10,20 ); 
        //then
        assertEquals("20 past 10", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor8and50() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(8,50 ); 
        //then
        assertEquals("10 to 9", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor9and30() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(9,30 ); 
        //then
        assertEquals("half past 9", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor10() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(10,0 ); 
        //then
        assertEquals("10 o'clock", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor23and35() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(23,35 ); 
        //then
        assertEquals("25 to midnight", announcement);
	}
	@Test
	void shouldReturnTheRightAnouncementFor12() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(12,0 ); 
        //then
        assertEquals("noon", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor12and20() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(12,20 ); 
        //then
        assertEquals("20 past noon", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor11and40() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(11,40 ); 
        //then
        assertEquals("20 to noon", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor00and00() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(0,0 ); 
        //then
        assertEquals("midnight", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor12and30() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(12,30 ); 
        //then
        assertEquals("half past 12", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor9and45() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(9, 45); 
        //then
        assertEquals("quarter to 10", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor10and15() {
        // fail("not implemented");
        //given
        //when
        var announcement = radioAnnouncement.announce(10, 15); 
        //then
        assertEquals("quarter past 10", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor10and15withHoursTexted() {
        // fail("not implemented");
        //given
        radioAnnouncement = new RadioAnnouncement(true); 
        //when
        var announcement = radioAnnouncement.announce(10, 15); 
        //then
        assertEquals("quarter past ten", announcement);
	}

	@Test
	void shouldReturnTheRightAnouncementFor22and32withHoursTexted() {
        // fail("not implemented");
        //given
        radioAnnouncement = new RadioAnnouncement(true); 
        //when
        var announcement = radioAnnouncement.announce(22, 32); 
        //then
        assertEquals("28 to twenty three", announcement);
	}
}
