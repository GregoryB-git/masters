.class public Le4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:Ljava/lang/String;

.field public c:B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/g;->b:Ljava/lang/String;

    const/4 p1, 0x1

    iput-byte p1, p0, Le4/g;->c:B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/g;->a:[B

    const/4 p1, 0x2

    iput-byte p1, p0, Le4/g;->c:B

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le4/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
