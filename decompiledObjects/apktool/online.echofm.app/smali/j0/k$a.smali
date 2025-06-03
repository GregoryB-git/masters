.class public Lj0/k$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/k;-><init>([Lj0/i;[Lj0/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lj0/k;


# direct methods
.method public constructor <init>(Lj0/k;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj0/k$a;->o:Lj0/k;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/k$a;->o:Lj0/k;

    .line 2
    .line 3
    invoke-static {v0}, Lj0/k;->g(Lj0/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
