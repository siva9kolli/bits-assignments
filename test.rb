require "rubygems"
require "rotp"

totp = ROTP::TOTP.new("7AL2I42WH5KXYJGVLEUHPZNL4LOJ6TR6OQ2SI5JQ7R4HO6K67V7A")
p "Current OTP: #{totp.now}"
