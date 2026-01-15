            Optional<User> maybe = store.findByEmail(email);
            if (maybe.isEmpty()) {
                System.out.println("Benutzer nicht gefunden.");
                logger.logEvent(email, "Login", "UserNotFound");
                return;
            }
            User user = maybe.get();
            if (user.verifyPassword(password)) {