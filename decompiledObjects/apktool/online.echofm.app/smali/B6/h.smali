.class public abstract LB6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LB6/d;JLD6/b;)LB6/h;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    new-instance v0, LB6/h$a;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, LB6/h$a;-><init>(LB6/d;JLD6/b;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string p1, "source == null"

    .line 12
    .line 13
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public static b(LB6/d;[B)LB6/h;
    .locals 3

    .line 1
    new-instance v0, LD6/a;

    .line 2
    .line 3
    invoke-direct {v0}, LD6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LD6/a;->B([B)LD6/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length p1, p1

    .line 11
    int-to-long v1, p1

    .line 12
    invoke-static {p0, v1, v2, v0}, LB6/h;->a(LB6/d;JLD6/b;)LB6/h;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public abstract c()LD6/b;
.end method

.method public close()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LB6/h;->c()LD6/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LC6/a;->c(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
