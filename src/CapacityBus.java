public enum CapacityBus {

    CAPACITY_ES(0, 10),
    CAPACITY_S(11, 25),
    CAPACITY_M(40, 50),
    CAPACITY_B(60, 80),
    CAPACITY_EB(100, 120),
    CAPACITY_ERROR(121);

    private int capacityUp;
    private int capacityDown;

    public int getCapacityUp() {
        return capacityUp;
    }

    public int getCapacityDown() {
        return capacityDown;
    }

    CapacityBus(int capacityDown, int capacityUp) {
        this.capacityDown = capacityDown;
        this.capacityUp = capacityUp;
    }

    CapacityBus(int capacityDown) {
        this.capacityDown = capacityDown;
    }

    public static CapacityBus change(int numberSeats) {
        numberSeats = Math.abs(numberSeats);
        if (numberSeats <= 10) {
            return CapacityBus.CAPACITY_ES;
        }
        if (numberSeats <= 25) {
            return CapacityBus.CAPACITY_S;
        }
        if (numberSeats <= 50) {
            return CapacityBus.CAPACITY_M;
        }
        if (numberSeats <= 80) {
            return CapacityBus.CAPACITY_B;
        }
        if (numberSeats <= 120) {
            return CapacityBus.CAPACITY_EB;
        }
        return CAPACITY_ERROR;
    }
}