.class public final Ls5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final synthetic b:Ls5/c;


# direct methods
.method public constructor <init>(Ls5/c;I)V
    .locals 0

    iput-object p1, p0, Ls5/c$a;->b:Ls5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ls5/c$a;->a:I

    return-void
.end method
