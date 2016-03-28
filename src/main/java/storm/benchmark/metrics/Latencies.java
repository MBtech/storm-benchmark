package storm.benchmark.metrics;

import backtype.storm.metric.api.IMetric;
import java.util.ArrayList;

public class Latencies implements IMetric {
    ArrayList<Integer> _latencies = new ArrayList<Integer>();

    public Latencies() {
    }

    public void add(int latency) {
        _latencies.add(latency);
    }

    public Object getValueAndReset() {
        ArrayList<Integer> ret = _latencies;
        _latencies = new ArrayList<Integer>();
        return ret;
    }
}
