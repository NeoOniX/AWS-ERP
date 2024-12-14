INSERT INTO `customers` (`email`, `name`, `phone_number`, `address`) VALUES
('jean.dupont@example.com', 'Jean DUPONT', '0123456789', '123 rue de la République - 75001 Paris'),
('claire.martin@example.com', 'Claire MARTIN', '0987654321', '456 Avenue des Champs - 69001 Lyon'),
('luc.bernard@example.com', 'Luc BERNARD', '0147258369', '789 Boulevard Saint-Germain - 13001 Marseille'),
('sophie.robert@example.com', 'Sophie ROBERT', '0165492837', '321 Place de l''Étoile - 06000 Nice'),
('pierre.lemoine@example.com', 'Pierre LEMOINE', '0154789263', '654 Rue des Fleurs - 31000 Toulouse');

INSERT INTO `products` (`name`, `description`, `price_per_cubic_meter`) VALUES
('Béton standard', 'Béton de qualité standard pour la construction de fondations et structures de base.', 75.00),
('Béton haute résistance', 'Béton offrant une résistance accrue, idéal pour des projets nécessitant une grande durabilité.', 95.00),
('Béton léger', 'Béton léger, utilisé pour les constructions où l''isolation thermique et acoustique est essentielle.', 85.00),
('Béton fibré', 'Béton renforcé de fibres, utilisé pour des applications spécifiques comme les chaussées et dalles.', 120.00),
('Béton décoratif', 'Béton avec des pigments pour un fini esthétique, utilisé pour les allées et autres surfaces visibles.', 110.00);

INSERT INTO `orders` (`customer_id`, `product_id`, `quantity`, `price`, `order_date`, `delivery_date`, `status`) VALUES
(1, 1, 10, 750, '2024-06-11', '2024-06-14', 'DELIVERED'),
(2, 2, 5, 475, '2024-06-15', '2024-06-18', 'DELIVERED'),
(3, 3, 15, 1275, '2024-06-20', '2024-06-24', 'DELIVERED'),
(4, 4, 20, 2400, '2024-06-22', '2024-06-26', 'DELIVERED'),
(5, 5, 10, 1100, '2024-06-30', '2024-07-03', 'DELIVERED');