package learning.com.queue;

import java.util.Comparator;

public class RequestComparator implements Comparator<Request>{

    @Override
    public int compare(Request o1, Request o2) {
        boolean o1NotBu = (o1.getRequestType()!= RequestType.BLOCK) && (o1.getRequestType()!= RequestType.UNBLOCK);
        boolean o2NotBu = (o2.getRequestType()!= RequestType.BLOCK) && (o2.getRequestType()!= RequestType.UNBLOCK);
        if(o1NotBu && o2NotBu){
            return o1.getCalendar().compareTo(o2.getCalendar());
        }
        if((!o1NotBu) && (!o2NotBu)){
             return o1.getCalendar().compareTo(o2.getCalendar());
        }
        if ((o1.getRequestType() == RequestType.BLOCK) || (o1.getRequestType() == RequestType.UNBLOCK)){
            return 1;
        }
        return -1;
    }
}
