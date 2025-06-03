.class public final Lnc/j1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lub/h$c<",
        "Lnc/j1;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic a:Lnc/j1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/j1$b;

    invoke-direct {v0}, Lnc/j1$b;-><init>()V

    sput-object v0, Lnc/j1$b;->a:Lnc/j1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
