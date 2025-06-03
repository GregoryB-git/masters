.class public final synthetic Lg0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic p:I

.field public final synthetic q:Lg0/n$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILg0/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/m;->o:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    iput p2, p0, Lg0/m;->p:I

    .line 7
    .line 8
    iput-object p3, p0, Lg0/m;->q:Lg0/n$a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/m;->o:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    iget v1, p0, Lg0/m;->p:I

    .line 4
    .line 5
    iget-object v2, p0, Lg0/m;->q:Lg0/n$a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lg0/n;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILg0/n$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
