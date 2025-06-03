.class public final Lw/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lb0/g;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb0/g;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/d$e;->a:Lb0/g;

    iput p2, p0, Lw/d$e;->c:I

    iput p3, p0, Lw/d$e;->b:I

    iput-object p4, p0, Lw/d$e;->d:Ljava/lang/String;

    return-void
.end method
