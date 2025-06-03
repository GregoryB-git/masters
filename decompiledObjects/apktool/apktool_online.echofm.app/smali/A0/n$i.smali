.class public abstract LA0/n$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA0/n$i$a;
    }
.end annotation


# instance fields
.field public final o:I

.field public final p:Ld0/J;

.field public final q:I

.field public final r:Ld0/q;


# direct methods
.method public constructor <init>(ILd0/J;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LA0/n$i;->o:I

    .line 5
    .line 6
    iput-object p2, p0, LA0/n$i;->p:Ld0/J;

    .line 7
    .line 8
    iput p3, p0, LA0/n$i;->q:I

    .line 9
    .line 10
    invoke-virtual {p2, p3}, Ld0/J;->a(I)Ld0/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LA0/n$i;->r:Ld0/q;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract c()I
.end method

.method public abstract e(LA0/n$i;)Z
.end method
