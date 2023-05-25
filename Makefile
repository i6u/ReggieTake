ABSOLUTE_PATH := $(abspath $(lastword $(PWD)))

.PHONY: up
up:
	docker compose -f docker-compose.yaml up -d --build

.PHONY: ps
ps:
	docker compose -f docker-compose.yaml ps

.PHONY: down
down:
	docker compose -f docker-compose.yaml down
