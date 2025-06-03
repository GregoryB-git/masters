.class public Lm0/N$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final a:[Le0/b;

.field public final b:Lm0/d0;

.field public final c:Le0/f;


# direct methods
.method public varargs constructor <init>([Le0/b;)V
    .locals 2

    .line 1
    new-instance v0, Lm0/d0;

    invoke-direct {v0}, Lm0/d0;-><init>()V

    new-instance v1, Le0/f;

    invoke-direct {v1}, Le0/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lm0/N$h;-><init>([Le0/b;Lm0/d0;Le0/f;)V

    return-void
.end method

.method public constructor <init>([Le0/b;Lm0/d0;Le0/f;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Le0/b;

    iput-object v0, p0, Lm0/N$h;->a:[Le0/b;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lm0/N$h;->b:Lm0/d0;

    iput-object p3, p0, Lm0/N$h;->c:Le0/f;

    array-length v1, p1

    aput-object p2, v0, v1

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(Ld0/C;)Ld0/C;
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/N$h;->c:Le0/f;

    .line 2
    .line 3
    iget v1, p1, Ld0/C;->a:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le0/f;->j(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm0/N$h;->c:Le0/f;

    .line 9
    .line 10
    iget v1, p1, Ld0/C;->b:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Le0/f;->i(F)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/N$h;->b:Lm0/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm0/d0;->v()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public c(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N$h;->b:Lm0/d0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm0/d0;->E(Z)V

    .line 4
    .line 5
    .line 6
    return p1
.end method

.method public d(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N$h;->c:Le0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/f;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lm0/N$h;->c:Le0/f;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Le0/f;->h(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    :cond_0
    return-wide p1
.end method

.method public e()[Le0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N$h;->a:[Le0/b;

    .line 2
    .line 3
    return-object v0
.end method
