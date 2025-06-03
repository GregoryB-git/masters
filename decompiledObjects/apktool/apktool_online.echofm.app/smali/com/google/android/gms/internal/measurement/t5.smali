.class public final Lcom/google/android/gms/internal/measurement/t5;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final o:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/I4;)V
    .locals 0

    const-string p1, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t5;->o:Ljava/util/List;

    return-void
.end method
