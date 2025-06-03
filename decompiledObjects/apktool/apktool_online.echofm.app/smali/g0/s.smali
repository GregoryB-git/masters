.class public final synthetic Lg0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lg0/t;

.field public final synthetic p:Lg0/t$c;


# direct methods
.method public synthetic constructor <init>(Lg0/t;Lg0/t$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/s;->o:Lg0/t;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/s;->p:Lg0/t$c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/s;->o:Lg0/t;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/s;->p:Lg0/t$c;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lg0/t;->a(Lg0/t;Lg0/t$c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
