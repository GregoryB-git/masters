package com.facebook.drawee.components;

public enum DraweeEventTracker$Event
{
  static
  {
    Event localEvent1 = new Event("ON_SET_HIERARCHY", 0);
    ON_SET_HIERARCHY = localEvent1;
    Event localEvent2 = new Event("ON_CLEAR_HIERARCHY", 1);
    ON_CLEAR_HIERARCHY = localEvent2;
    Event localEvent3 = new Event("ON_SET_CONTROLLER", 2);
    ON_SET_CONTROLLER = localEvent3;
    Event localEvent4 = new Event("ON_CLEAR_OLD_CONTROLLER", 3);
    ON_CLEAR_OLD_CONTROLLER = localEvent4;
    Event localEvent5 = new Event("ON_CLEAR_CONTROLLER", 4);
    ON_CLEAR_CONTROLLER = localEvent5;
    Event localEvent6 = new Event("ON_INIT_CONTROLLER", 5);
    ON_INIT_CONTROLLER = localEvent6;
    Event localEvent7 = new Event("ON_ATTACH_CONTROLLER", 6);
    ON_ATTACH_CONTROLLER = localEvent7;
    Event localEvent8 = new Event("ON_DETACH_CONTROLLER", 7);
    ON_DETACH_CONTROLLER = localEvent8;
    Event localEvent9 = new Event("ON_RELEASE_CONTROLLER", 8);
    ON_RELEASE_CONTROLLER = localEvent9;
    Event localEvent10 = new Event("ON_DATASOURCE_SUBMIT", 9);
    ON_DATASOURCE_SUBMIT = localEvent10;
    Event localEvent11 = new Event("ON_DATASOURCE_RESULT", 10);
    ON_DATASOURCE_RESULT = localEvent11;
    Event localEvent12 = new Event("ON_DATASOURCE_RESULT_INT", 11);
    ON_DATASOURCE_RESULT_INT = localEvent12;
    Event localEvent13 = new Event("ON_DATASOURCE_FAILURE", 12);
    ON_DATASOURCE_FAILURE = localEvent13;
    Event localEvent14 = new Event("ON_DATASOURCE_FAILURE_INT", 13);
    ON_DATASOURCE_FAILURE_INT = localEvent14;
    Event localEvent15 = new Event("ON_HOLDER_ATTACH", 14);
    ON_HOLDER_ATTACH = localEvent15;
    Event localEvent16 = new Event("ON_HOLDER_DETACH", 15);
    ON_HOLDER_DETACH = localEvent16;
    Event localEvent17 = new Event("ON_DRAWABLE_SHOW", 16);
    ON_DRAWABLE_SHOW = localEvent17;
    Event localEvent18 = new Event("ON_DRAWABLE_HIDE", 17);
    ON_DRAWABLE_HIDE = localEvent18;
    Event localEvent19 = new Event("ON_ACTIVITY_START", 18);
    ON_ACTIVITY_START = localEvent19;
    Event localEvent20 = new Event("ON_ACTIVITY_STOP", 19);
    ON_ACTIVITY_STOP = localEvent20;
    Event localEvent21 = new Event("ON_RUN_CLEAR_CONTROLLER", 20);
    ON_RUN_CLEAR_CONTROLLER = localEvent21;
    Event localEvent22 = new Event("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
    ON_SCHEDULE_CLEAR_CONTROLLER = localEvent22;
    Event localEvent23 = new Event("ON_SAME_CONTROLLER_SKIPPED", 22);
    ON_SAME_CONTROLLER_SKIPPED = localEvent23;
    Event localEvent24 = new Event("ON_SUBMIT_CACHE_HIT", 23);
    ON_SUBMIT_CACHE_HIT = localEvent24;
    $VALUES = new Event[] { localEvent1, localEvent2, localEvent3, localEvent4, localEvent5, localEvent6, localEvent7, localEvent8, localEvent9, localEvent10, localEvent11, localEvent12, localEvent13, localEvent14, localEvent15, localEvent16, localEvent17, localEvent18, localEvent19, localEvent20, localEvent21, localEvent22, localEvent23, localEvent24 };
  }
  
  private DraweeEventTracker$Event() {}
}

/* Location:
 * Qualified Name:     com.facebook.drawee.components.DraweeEventTracker.Event
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */