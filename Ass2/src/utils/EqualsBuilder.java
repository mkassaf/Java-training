package utils;
public class EqualsBuilder {
    private boolean isEquals = true;

    /**
     * Appends the fields to the builder.
     *
     * @param field1 the first field ( Object ) to compare
     * @param field2 the second field ( Object ) to compare
     * @return the builder object
     */
    public EqualsBuilder append(Object field1, Object field2) {
        if (isEquals) {
            if (field1 == null) {
                isEquals = field2 == null; // if both are null, then they are equal
            } else {
                isEquals = field1.equals(field2); // if both are not null, then compare them
            }
        }
        return this;
    }

    public boolean isEquals() {
        return isEquals;
    }
}
