.class public final Lc3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lc3/k;

.field public static final c:Lc3/k;

.field public static final d:Lc3/k;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc3/k;

    .line 2
    .line 3
    const-string v1, "ENABLED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lc3/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc3/k;->b:Lc3/k;

    .line 9
    .line 10
    new-instance v0, Lc3/k;

    .line 11
    .line 12
    const-string v1, "DISABLED"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lc3/k;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lc3/k;->c:Lc3/k;

    .line 18
    .line 19
    new-instance v0, Lc3/k;

    .line 20
    .line 21
    const-string v1, "DESTROYED"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lc3/k;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lc3/k;->d:Lc3/k;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc3/k;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/k;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
