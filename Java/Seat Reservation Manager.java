//1845 Seat Reservation Manager
class SeatManager {
    private PriorityQueue<Integer> seats;
       public SeatManager(int n) {
        seats = new PriorityQueue<>();
                for (int i = 1; i <= n; i++) {
            seats.offer(i);
        }
    }

    public int reserve() {
        if (!seats.isEmpty()) { 
            int reservedSeat = seats.poll(); 
            return reservedSeat; 
        } else {
            return -1; 
          }
    }

    public void unreserve(int seatNumber) {
        seats.offer(seatNumber); 
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
