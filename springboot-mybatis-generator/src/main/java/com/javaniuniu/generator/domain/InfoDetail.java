package com.javaniuniu.generator.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class InfoDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.info_id
     *
     * @mbg.generated
     */
    private String infoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.checked_date
     *
     * @mbg.generated
     */
    private LocalDateTime checkedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.solve_num
     *
     * @mbg.generated
     */
    private Integer solveNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.submission_num
     *
     * @mbg.generated
     */
    private Integer submissionNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_detail.last_year_checked_num
     *
     * @mbg.generated
     */
    private Integer lastYearCheckedNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.info_id
     *
     * @return the value of info_detail.info_id
     *
     * @mbg.generated
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.info_id
     *
     * @param infoId the value for info_detail.info_id
     *
     * @mbg.generated
     */
    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.username
     *
     * @return the value of info_detail.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.username
     *
     * @param username the value for info_detail.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.checked_date
     *
     * @return the value of info_detail.checked_date
     *
     * @mbg.generated
     */
    public LocalDateTime getCheckedDate() {
        return checkedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.checked_date
     *
     * @param checkedDate the value for info_detail.checked_date
     *
     * @mbg.generated
     */
    public void setCheckedDate(LocalDateTime checkedDate) {
        this.checkedDate = checkedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.solve_num
     *
     * @return the value of info_detail.solve_num
     *
     * @mbg.generated
     */
    public Integer getSolveNum() {
        return solveNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.solve_num
     *
     * @param solveNum the value for info_detail.solve_num
     *
     * @mbg.generated
     */
    public void setSolveNum(Integer solveNum) {
        this.solveNum = solveNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.submission_num
     *
     * @return the value of info_detail.submission_num
     *
     * @mbg.generated
     */
    public Integer getSubmissionNum() {
        return submissionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.submission_num
     *
     * @param submissionNum the value for info_detail.submission_num
     *
     * @mbg.generated
     */
    public void setSubmissionNum(Integer submissionNum) {
        this.submissionNum = submissionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_detail.last_year_checked_num
     *
     * @return the value of info_detail.last_year_checked_num
     *
     * @mbg.generated
     */
    public Integer getLastYearCheckedNum() {
        return lastYearCheckedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_detail.last_year_checked_num
     *
     * @param lastYearCheckedNum the value for info_detail.last_year_checked_num
     *
     * @mbg.generated
     */
    public void setLastYearCheckedNum(Integer lastYearCheckedNum) {
        this.lastYearCheckedNum = lastYearCheckedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_detail
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infoId=").append(infoId);
        sb.append(", username=").append(username);
        sb.append(", checkedDate=").append(checkedDate);
        sb.append(", solveNum=").append(solveNum);
        sb.append(", submissionNum=").append(submissionNum);
        sb.append(", lastYearCheckedNum=").append(lastYearCheckedNum);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_detail
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        InfoDetail other = (InfoDetail) that;
        return (this.getInfoId() == null ? other.getInfoId() == null : this.getInfoId().equals(other.getInfoId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getCheckedDate() == null ? other.getCheckedDate() == null : this.getCheckedDate().equals(other.getCheckedDate()))
            && (this.getSolveNum() == null ? other.getSolveNum() == null : this.getSolveNum().equals(other.getSolveNum()))
            && (this.getSubmissionNum() == null ? other.getSubmissionNum() == null : this.getSubmissionNum().equals(other.getSubmissionNum()))
            && (this.getLastYearCheckedNum() == null ? other.getLastYearCheckedNum() == null : this.getLastYearCheckedNum().equals(other.getLastYearCheckedNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_detail
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoId() == null) ? 0 : getInfoId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getCheckedDate() == null) ? 0 : getCheckedDate().hashCode());
        result = prime * result + ((getSolveNum() == null) ? 0 : getSolveNum().hashCode());
        result = prime * result + ((getSubmissionNum() == null) ? 0 : getSubmissionNum().hashCode());
        result = prime * result + ((getLastYearCheckedNum() == null) ? 0 : getLastYearCheckedNum().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table info_detail
     *
     * @mbg.generated
     */
    public enum Column {
        infoId("info_id", "infoId", "VARCHAR", false),
        username("username", "username", "VARCHAR", false),
        checkedDate("checked_date", "checkedDate", "TIMESTAMP", false),
        solveNum("solve_num", "solveNum", "INTEGER", false),
        submissionNum("submission_num", "submissionNum", "INTEGER", false),
        lastYearCheckedNum("last_year_checked_num", "lastYearCheckedNum", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info_detail
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}