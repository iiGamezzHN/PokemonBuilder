package com.example.davidarisz.pokemonbuilder.models;

public class StatsItem {
    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public class Stats {
        private int base_stat;
        private int effort;
        private Stat stat;

        public int getBase_stat() {
            return base_stat;
        }

        public void setBase_stat(int base_stat) {
            this.base_stat = base_stat;
        }

        public int getEffort() {
            return effort;
        }

        public void setEffort(int effort) {
            this.effort = effort;
        }

        public Stat getStat() {
            return stat;
        }

        public void setStat(Stat stat) {
            this.stat = stat;
        }



        public class Stat {
            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
