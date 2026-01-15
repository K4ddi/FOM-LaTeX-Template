            while ((line = r.readLine()) != null) {
                lineNo++;
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    User u = User.fromCSV(line);
                    out.add(u);
                } catch (IllegalArgumentException e) {
                    logger.logError("UserStore", "Skipping malformed user line " + lineNo + ": " + line, e);
                }
            }