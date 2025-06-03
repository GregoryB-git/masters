.class public final synthetic Lx1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/F$b;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/Set;

.field public final synthetic d:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lx1/d;->b:Ljava/util/Set;

    .line 7
    .line 8
    iput-object p3, p0, Lx1/d;->c:Ljava/util/Set;

    .line 9
    .line 10
    iput-object p4, p0, Lx1/d;->d:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lx1/K;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/d;->b:Ljava/util/Set;

    .line 4
    .line 5
    iget-object v2, p0, Lx1/d;->c:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v3, p0, Lx1/d;->d:Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Lx1/g;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lx1/K;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
