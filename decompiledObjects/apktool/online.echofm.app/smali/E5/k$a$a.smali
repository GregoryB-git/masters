.class public LE5/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE5/k$a;->a(Ljava/nio/ByteBuffer;LE5/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LE5/c$b;

.field public final synthetic b:LE5/k$a;


# direct methods
.method public constructor <init>(LE5/k$a;LE5/c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/k$a$a;->b:LE5/k$a;

    .line 2
    .line 3
    iput-object p2, p0, LE5/k$a$a;->a:LE5/c$b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/k$a$a;->a:LE5/c$b;

    .line 2
    .line 3
    iget-object v1, p0, LE5/k$a$a;->b:LE5/k$a;

    .line 4
    .line 5
    iget-object v1, v1, LE5/k$a;->b:LE5/k;

    .line 6
    .line 7
    invoke-static {v1}, LE5/k;->a(LE5/k;)LE5/l;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1, p1}, LE5/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/k$a$a;->a:LE5/c$b;

    .line 2
    .line 3
    iget-object v1, p0, LE5/k$a$a;->b:LE5/k$a;

    .line 4
    .line 5
    iget-object v1, v1, LE5/k$a;->b:LE5/k;

    .line 6
    .line 7
    invoke-static {v1}, LE5/k;->a(LE5/k;)LE5/l;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1, p1, p2, p3}, LE5/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/k$a$a;->a:LE5/c$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
