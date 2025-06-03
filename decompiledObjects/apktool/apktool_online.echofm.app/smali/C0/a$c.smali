.class public final LC0/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final o:LC0/a$b;


# direct methods
.method public constructor <init>(LC0/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/a$c;->o:LC0/a$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public o(LB0/n$e;JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, LC0/a$c;->o:LC0/a$b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {}, LC0/a;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LC0/a$c;->o:LC0/a$b;

    .line 12
    .line 13
    new-instance p2, Ljava/io/IOException;

    .line 14
    .line 15
    new-instance p3, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, LC0/a$b;->b(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p1, p0, LC0/a$c;->o:LC0/a$b;

    .line 28
    .line 29
    invoke-interface {p1}, LC0/a$b;->a()V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public r(LB0/n$e;JJLjava/io/IOException;I)LB0/n$c;
    .locals 0

    .line 1
    iget-object p1, p0, LC0/a$c;->o:LC0/a$b;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p6}, LC0/a$b;->b(Ljava/io/IOException;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p1, LB0/n;->f:LB0/n$c;

    .line 9
    .line 10
    return-object p1
.end method

.method public t(LB0/n$e;JJZ)V
    .locals 0

    .line 1
    return-void
.end method
