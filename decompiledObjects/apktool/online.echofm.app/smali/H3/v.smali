.class public abstract LH3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LJ3/B;Ljava/lang/String;Ljava/io/File;)LH3/v;
    .locals 1

    .line 1
    new-instance v0, LH3/b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LH3/b;-><init>(LJ3/B;Ljava/lang/String;Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract b()LJ3/B;
.end method

.method public abstract c()Ljava/io/File;
.end method

.method public abstract d()Ljava/lang/String;
.end method
