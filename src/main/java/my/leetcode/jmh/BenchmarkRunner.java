package my.leetcode.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class BenchmarkRunner {

  private int first;
  private int second;

  @Setup
  public void setup() {
    first = 3;
    second = 7;
  }

  @Benchmark
  public int benchmarkAddition() {
    return first + second;
  }

  public static void main(String[] args) throws Exception {
    org.openjdk.jmh.Main.main(args);
  }
}
