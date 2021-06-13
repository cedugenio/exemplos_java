package br.com.cedugenio.exemplos.autopolicy;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(111111, "Toyota Camry","NY");
        AutoPolicy policy2 = new AutoPolicy(222222,"Ford Fusion","ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
