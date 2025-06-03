.class public final Lx0/i$j;
.super Lx0/i$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/i;->prepareCallInternal(Le/a;Lo/a;Ld/b;)Ld/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Le/a;

.field public final synthetic d:Ld/b;

.field public final synthetic e:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;Lo/a;Ljava/util/concurrent/atomic/AtomicReference;Le/a;Ld/b;)V
    .locals 0

    iput-object p1, p0, Lx0/i$j;->e:Lx0/i;

    iput-object p2, p0, Lx0/i$j;->a:Lo/a;

    iput-object p3, p0, Lx0/i$j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lx0/i$j;->c:Le/a;

    iput-object p5, p0, Lx0/i$j;->d:Ld/b;

    invoke-direct {p0}, Lx0/i$m;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lx0/i$j;->e:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lx0/i$j;->a:Lo/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lo/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld/g;

    iget-object v2, p0, Lx0/i$j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lx0/i$j;->e:Lx0/i;

    iget-object v4, p0, Lx0/i$j;->c:Le/a;

    iget-object v5, p0, Lx0/i$j;->d:Ld/b;

    invoke-virtual {v1, v0, v3, v4, v5}, Ld/g;->c(Ljava/lang/String;Lb1/o;Le/a;Ld/b;)Ld/e;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
