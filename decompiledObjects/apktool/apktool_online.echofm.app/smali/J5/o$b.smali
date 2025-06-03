.class public LJ5/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/p$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ5/o;->e(LE5/c;LJ5/p$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:LE5/a$e;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;LE5/a$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ5/o$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, LJ5/o$b;->b:LE5/a$e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LJ5/o$b;->c(Ljava/lang/Void;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {p1}, LJ5/p;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LJ5/o$b;->b:LE5/a$e;

    .line 6
    .line 7
    invoke-interface {v0, p1}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(Ljava/lang/Void;)V
    .locals 2

    .line 1
    iget-object p1, p0, LJ5/o$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LJ5/o$b;->b:LE5/a$e;

    .line 9
    .line 10
    iget-object v0, p0, LJ5/o$b;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-interface {p1, v0}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
