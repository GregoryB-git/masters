.class public final Lnc/g;
.super Lnc/y0;
.source "SourceFile"


# instance fields
.field public final r:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lnc/y0;-><init>()V

    iput-object p1, p0, Lnc/g;->r:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final I0()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lnc/g;->r:Ljava/lang/Thread;

    return-object v0
.end method
