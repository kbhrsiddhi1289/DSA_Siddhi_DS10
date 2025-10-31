import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Ignore everything after '+' in the local name
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }

            // Remove all '.' in the local name
            local = local.replace(".", "");

            // Combine cleaned local and domain parts
            String normalizedEmail = local + "@" + domain;

            uniqueEmails.add(normalizedEmail);
        }

        return uniqueEmails.size();
    }
}